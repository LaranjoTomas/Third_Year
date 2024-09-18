import org.stringtemplate.v4.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("CheckReturnValue")
public class Translater extends CsvTableBaseVisitor<ST> {
   STGroup templates = new STGroupFile("templates.stg");
   List<ST> headers = new ArrayList<>();
   List<ST> rows = new ArrayList<>();

   @Override
   public ST visitFile(CsvTableParser.FileContext ctx) {
      ST xmlMultiline = templates.getInstanceOf("XmlMultiline");
      xmlMultiline.add("tag", "table");
      xmlMultiline.add("entry", rows);
      return xmlMultiline;
   }

   @Override
   public ST visitHdr(CsvTableParser.HdrContext ctx) {
      headers = ctx.row().field().stream()
         .map(this::visit)
         .collect(Collectors.toList());
      return null;
   }

   @Override
   public ST visitRow(CsvTableParser.RowContext ctx) {
      ST row = templates.getInstanceOf("XmlOneLIne");
      List<ST> cells = ctx.field().stream()
         .map(this::visit)
         .collect(Collectors.toList());
      row.add("tag", "tr");
      row.add("entry", cells);
      rows.add(row);
      return null;
   }

   @Override
   public ST visitField(CsvTableParser.FieldContext ctx) {
      ST cell = templates.getInstanceOf("XmlOneline");
      cell.add("tag", "th");
      cell.add("entry", ctx.getText());
      return cell;
   }
}