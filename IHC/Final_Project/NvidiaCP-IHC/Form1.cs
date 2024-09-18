using System;
using System.Drawing;
using System.Windows.Forms;
using System.Management;
using System.Threading.Tasks;
using System.Drawing.Text;
using NvidiaCP_IHC.Properties;
using System.Collections.Generic;
//using System.Drawing.Drawing2D;

namespace NvidiaCP_IHC
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private void Form1_Load(object sender, EventArgs e)
        {
            this.BackColor = Color.FromArgb(28, 28, 28);

            string userName = System.Security.Principal.WindowsIdentity.GetCurrent().Name;
            string usernameWithoutDomain = userName.Split('\\')[1];

            // retrieve pc specs like cpu and gpu
            ManagementObjectSearcher searcher = new ManagementObjectSearcher("SELECT * FROM Win32_Processor");
            foreach (ManagementObject share in searcher.Get())
            {
                specs_label.Text = "CPU: " + share["Name"].ToString();
            }

            ManagementObjectSearcher searcher2 = new ManagementObjectSearcher("SELECT * FROM Win32_VideoController");
            foreach (ManagementObject share in searcher2.Get())
            {
                specs_label.Text += "\nGPU: " + share["Name"].ToString();
            }


            label9.Text = "Welcome\n" + usernameWithoutDomain;
            label9.ForeColor = Color.FromArgb(235, 235, 235);
            label9.TextAlign = ContentAlignment.MiddleCenter;

            label10.ForeColor = Color.FromArgb(235, 235, 235);
            label22.ForeColor = Color.FromArgb(235, 235, 235);
            label23.ForeColor = Color.FromArgb(235, 235, 235);
            label24.ForeColor = Color.FromArgb(235, 235, 235);
            label25.ForeColor = Color.FromArgb(235, 235, 235);
            label26.ForeColor = Color.FromArgb(235, 235, 235);
            label27.ForeColor = Color.FromArgb(235, 235, 235);
            label28.ForeColor = Color.FromArgb(235, 235, 235);
            label28.BackColor = Color.FromArgb(28, 28, 28);
            label29.ForeColor = Color.FromArgb(235, 235, 235);
            label30.ForeColor = Color.FromArgb(235, 235, 235);
            label31.ForeColor = Color.FromArgb(235, 235, 235);
            label32.ForeColor = Color.FromArgb(235, 235, 235);
            label33.ForeColor = Color.FromArgb(235, 235, 235);
            label34.ForeColor = Color.FromArgb(235, 235, 235);
            label35.ForeColor = Color.FromArgb(235, 235, 235);
            label36.ForeColor = Color.FromArgb(235, 235, 235);
            label37.ForeColor = Color.FromArgb(235, 235, 235);
            label38.ForeColor = Color.FromArgb(235, 235, 235);
            label39.ForeColor = Color.FromArgb(235, 235, 235);
            label40.ForeColor = Color.FromArgb(235, 235, 235);
            label41.ForeColor = Color.FromArgb(235, 235, 235);
            label42.ForeColor = Color.FromArgb(235, 235, 235);
            label43.ForeColor = Color.FromArgb(235, 235, 235);
            label44.ForeColor = Color.FromArgb(235, 235, 235);
            label45.ForeColor = Color.FromArgb(235, 235, 235);
            label46.ForeColor = Color.FromArgb(235, 235, 235);

            label11.BackColor = Color.FromArgb(94, 140, 12);
            label12.BackColor = Color.FromArgb(94, 140, 12);
            label13.BackColor = Color.FromArgb(94, 140, 12);
            label14.BackColor = Color.FromArgb(94, 140, 12);

            comboBox1.SelectedIndex = 1;
            comboBox1.BackColor = Color.FromArgb(45, 45, 45);
            comboBox1.ForeColor = Color.FromArgb(235, 235, 235);

            comboBox2.SelectedIndex = 0;
            comboBox2.BackColor = Color.FromArgb(45, 45, 45);
            comboBox2.ForeColor = Color.FromArgb(235, 235, 235);

            comboBox3.SelectedIndex = 0;
            comboBox3.BackColor = Color.FromArgb(45, 45, 45);
            comboBox3.ForeColor = Color.FromArgb(235, 235, 235);

            comboBox4.Items.Add("Auto-Select");
            comboBox4.SelectedIndex = 0;
            comboBox4.BackColor = Color.FromArgb(45, 45, 45);
            comboBox4.ForeColor = Color.FromArgb(235, 235, 235);

            ManagementObjectSearcher searcher3 = new ManagementObjectSearcher("SELECT * FROM Win32_VideoController");
            foreach (ManagementObject share in searcher2.Get())
            {
                comboBox4.Items.Add(share["Name"].ToString());
            }

            comboBox5.SelectedIndex = 0;
            comboBox5.BackColor = Color.FromArgb(45, 45, 45);
            comboBox5.ForeColor = Color.FromArgb(235, 235, 235);

            comboBox6.SelectedIndex = 0;
            comboBox6.BackColor = Color.FromArgb(45, 45, 45);
            comboBox6.ForeColor = Color.FromArgb(235, 235, 235);

            comboBox7.SelectedIndex = 0;
            comboBox7.BackColor = Color.FromArgb(45, 45, 45);
            comboBox7.ForeColor = Color.FromArgb(235, 235, 235);

            comboBox8.SelectedIndex = 1;
            comboBox8.BackColor = Color.FromArgb(45, 45, 45);
            comboBox8.ForeColor = Color.FromArgb(235, 235, 235);

            comboBox9.SelectedIndex = 0;
            comboBox9.BackColor = Color.FromArgb(45, 45, 45);
            comboBox9.ForeColor = Color.FromArgb(235, 235, 235);

            comboBox10.SelectedIndex = 6;
            comboBox10.BackColor = Color.FromArgb(45, 45, 45);
            comboBox10.ForeColor = Color.FromArgb(235, 235, 235);

            comboBox11.SelectedIndex = 2;
            comboBox11.BackColor = Color.FromArgb(45, 45, 45);
            comboBox11.ForeColor = Color.FromArgb(235, 235, 235);

            // Program Selection
            comboBox12.SelectedIndex = 0;
            comboBox12.BackColor = Color.FromArgb(45, 45, 45);
            comboBox12.ForeColor = Color.FromArgb(235, 235, 235);
            //

            comboBox13.SelectedIndex = 0;
            comboBox13.BackColor = Color.FromArgb(45, 45, 45);
            comboBox13.ForeColor = Color.FromArgb(235, 235, 235);

            comboBox14.SelectedIndex = 0;
            comboBox14.BackColor = Color.FromArgb(45, 45, 45);
            comboBox14.ForeColor = Color.FromArgb(235, 235, 235);

            comboBox15.SelectedIndex = 0;
            comboBox15.BackColor = Color.FromArgb(45, 45, 45);
            comboBox15.ForeColor = Color.FromArgb(235, 235, 235);

            comboBox16.SelectedIndex = 1;
            comboBox16.BackColor = Color.FromArgb(45, 45, 45);
            comboBox16.ForeColor = Color.FromArgb(235, 235, 235);

            comboBox17.SelectedIndex = 0;
            comboBox17.BackColor = Color.FromArgb(45, 45, 45);
            comboBox17.ForeColor = Color.FromArgb(235, 235, 235);

            comboBox18.SelectedIndex = 6;
            comboBox18.BackColor = Color.FromArgb(45, 45, 45);
            comboBox18.ForeColor = Color.FromArgb(235, 235, 235);

            comboBox19.SelectedIndex = 2;
            comboBox19.BackColor = Color.FromArgb(45, 45, 45);
            comboBox19.ForeColor = Color.FromArgb(235, 235, 235);

            label19.ForeColor = Color.FromArgb(235, 235, 235);
            label20.ForeColor = Color.FromArgb(235, 235, 235);
            label21.ForeColor = Color.FromArgb(235, 235, 235);

            tabPage1.BackColor = Color.FromArgb(28, 28, 28);
            tabPage2.BackColor = Color.FromArgb(28, 28, 28);

            specs_label.ForeColor = Color.FromArgb(235, 235, 235);

            label5.BackColor = Color.FromArgb(118, 185, 0);
            label5.Text = "";

            label6.BackColor = Color.FromArgb(28, 28, 28);
            label6.Text = "";

            label7.BackColor = Color.FromArgb(28, 28, 28);
            label7.Text = "";

            label8.BackColor = Color.FromArgb(28, 28, 28);
            label8.Text = "";

            label1.ForeColor = Color.White;
            label2.ForeColor = Color.White;
            label3.ForeColor = Color.White;
            label4.ForeColor = Color.White;

            tableLayoutPanel1.BackColor = Color.FromArgb(28, 28, 28);
            tableLayoutPanel1.CellPaint += tableLayoutPanel1_CellPaint;

            tabControl1.Appearance = TabAppearance.FlatButtons;
            tabControl1.ItemSize = new Size(0, 1);
            tabControl1.SizeMode = TabSizeMode.Fixed;


            foreach (TabPage tab in tabControl1.TabPages)
            {
                tab.Text = "";
                tab.BackColor = Color.FromArgb(28, 28, 28);
                tab.BorderStyle = BorderStyle.None;
            }
            //apply está em elipse
            //GraphicsPath gp = new GraphicsPath();
            //gp.AddEllipse(new Rectangle(0, 0, button4.Width, button4.Height));
            //button4.Region = new Region(gp);

            /////////////////////////////////////////

            needs_apply = false;
        }

        // COLORING TABS //
        private void tableLayoutPanel1_CellPaint(object sender, TableLayoutCellPaintEventArgs e)
        {
            // Check if the current cell belongs to the middle column
            if (e.Column == 1) // Assuming 0-based index
            {
                using (SolidBrush brush = new SolidBrush(Color.White)) // Customize the color
                {
                    e.Graphics.FillRectangle(brush, e.CellBounds); // Paint the cell background
                }
            }
        }

        private void tableLayoutPanel2_CellPaintYES(object sender, TableLayoutCellPaintEventArgs e)
        {
            // Check if the current cell belongs to the middle column
            if (e.Column == 0 && e.Row == 1) // Assuming 0-based index
            {
                using (SolidBrush brush = new SolidBrush(Color.FromArgb(118, 185, 0))) // Customize the color
                {
                    e.Graphics.FillRectangle(brush, e.CellBounds); // Paint the cell background
                }
            }
        }

        private void tableLayoutPanel2_CellPaintNO(object sender, TableLayoutCellPaintEventArgs e)
        {
            // Check if the current cell belongs to the middle column
            if (e.Column == 0 && e.Row == 1) // Assuming 0-based index
            {
                using (SolidBrush brush = new SolidBrush(Color.FromArgb(28, 28, 28))) // Customize the color
                {
                    e.Graphics.FillRectangle(brush, e.CellBounds); // Paint the cell background
                }
            }
        }

        private void tableLayoutPanel3_CellPaintYES(object sender, TableLayoutCellPaintEventArgs e)
        {
            // Check if the current cell belongs to the middle column
            if (e.Column == 0 && e.Row == 1) // Assuming 0-based index
            {
                using (SolidBrush brush = new SolidBrush(Color.FromArgb(118, 185, 0))) // Customize the color
                {
                    e.Graphics.FillRectangle(brush, e.CellBounds); // Paint the cell background
                }
            }
        }

        private void tableLayoutPanel3_CellPaintNO(object sender, TableLayoutCellPaintEventArgs e)
        {
            // Check if the current cell belongs to the middle column
            if (e.Column == 0 && e.Row == 1) // Assuming 0-based index
            {
                using (SolidBrush brush = new SolidBrush(Color.FromArgb(28, 28, 28))) // Customize the color
                {
                    e.Graphics.FillRectangle(brush, e.CellBounds); // Paint the cell background
                }
            }
        }

        private void tableLayoutPanel4_CellPaintYES(object sender, TableLayoutCellPaintEventArgs e)
        {
            // Check if the current cell belongs to the middle column
            if (e.Column == 0 && e.Row == 1) // Assuming 0-based index
            {
                using (SolidBrush brush = new SolidBrush(Color.FromArgb(118, 185, 0))) // Customize the color
                {
                    e.Graphics.FillRectangle(brush, e.CellBounds); // Paint the cell background
                }
            }
        }

        private void tableLayoutPanel4_CellPaintNO(object sender, TableLayoutCellPaintEventArgs e)
        {
            // Check if the current cell belongs to the middle column
            if (e.Column == 0 && e.Row == 1) // Assuming 0-based index
            {
                using (SolidBrush brush = new SolidBrush(Color.FromArgb(28, 28, 28))) // Customize the color
                {
                    e.Graphics.FillRectangle(brush, e.CellBounds); // Paint the cell background
                }
            }
        }

        private void tableLayoutPanel5_CellPaintYES(object sender, TableLayoutCellPaintEventArgs e)
        {
            // Check if the current cell belongs to the middle column
            if (e.Column == 0 && e.Row == 1) // Assuming 0-based index
            {
                using (SolidBrush brush = new SolidBrush(Color.FromArgb(118, 185, 0))) // Customize the color
                {
                    e.Graphics.FillRectangle(brush, e.CellBounds); // Paint the cell background
                }
            }
        }

        private void tableLayoutPanel5_CellPaintNO(object sender, TableLayoutCellPaintEventArgs e)
        {
            // Check if the current cell belongs to the middle column
            if (e.Column == 0 && e.Row == 1) // Assuming 0-based index
            {
                using (SolidBrush brush = new SolidBrush(Color.FromArgb(28, 28, 28))) // Customize the color
                {
                    e.Graphics.FillRectangle(brush, e.CellBounds); // Paint the cell background
                }
            }
        }

        // COLORING TABS //

        private void tableLayoutPanel2_Paint(object sender, PaintEventArgs e)
        {

        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
            label5.BackColor = Color.FromArgb(118, 185, 0);
            label5.Text = "";

            label6.BackColor = Color.FromArgb(28, 28, 28);
            label6.Text = "";

            label7.BackColor = Color.FromArgb(28, 28, 28);
            label7.Text = "";

            label8.BackColor = Color.FromArgb(28, 28, 28);
            label8.Text = "";

            if (needs_apply)
            {
                DialogResult dialogResult = MessageBox.Show("You have unsaved changes.\nDo you want to apply them?", "Apply Settings", MessageBoxButtons.YesNo);
                if (dialogResult == DialogResult.Yes)
                {
                    // apply settings
                    needs_apply = false;

                    mon1_orient_buffer = mon1_orient;
                    mon1_res_buffer = mon1_res;
                    mon1_refresh_buffer = mon1_refresh;

                    mon2_orient_buffer = mon2_orient;
                    mon2_res_buffer = mon2_res;
                    mon2_refresh_buffer = mon2_refresh;

                    tabControl1.SelectTab(home_tab);
                }
                else if (dialogResult == DialogResult.No)
                {
                    needs_apply = false;

                    mon1_orient = mon1_orient_buffer;
                    mon1_res = mon1_res_buffer;
                    mon1_refresh = mon1_refresh_buffer;

                    mon2_orient = mon2_orient_buffer;
                    mon2_res = mon2_res_buffer;
                    mon2_refresh = mon2_refresh_buffer;

                    tabControl1.SelectTab(home_tab);
                }
            } else
            {
                tabControl1.SelectTab(home_tab);
            }

        }

        private void pictureBox2_Click_1(object sender, EventArgs e)
        {
            tabControl1.SelectTab(display_tab);

            label5.BackColor = Color.FromArgb(28, 28, 28);
            label5.Text = "";

            label6.BackColor = Color.FromArgb(118, 185, 0);
            label6.Text = "";

            label7.BackColor = Color.FromArgb(28, 28, 28);
            label7.Text = "";

            label8.BackColor = Color.FromArgb(28, 28, 28);
            label8.Text = "";

            if (current_screen == 1)
            {
                comboBox1.SelectedIndex = mon1_res_buffer;
                comboBox2.SelectedIndex = mon1_orient_buffer;
                comboBox3.SelectedIndex = mon1_refresh_buffer;
            }
            else if (current_screen == 2)
            {
                comboBox1.SelectedIndex = mon2_res_buffer;
                comboBox2.SelectedIndex = mon2_orient_buffer;
                comboBox3.SelectedIndex = mon2_refresh_buffer;
            }

            needs_apply = false;
        }

        private void pictureBox3_Click(object sender, EventArgs e)
        {
            label5.BackColor = Color.FromArgb(28, 28, 28);
            label5.Text = "";

            label6.BackColor = Color.FromArgb(28, 28, 28);
            label6.Text = "";

            label7.BackColor = Color.FromArgb(118, 185, 0);
            label7.Text = "";

            label8.BackColor = Color.FromArgb(28, 28, 28);
            label8.Text = "";

            if (needs_apply)
            {
                DialogResult dialogResult = MessageBox.Show("You have unsaved changes.\nDo you want to apply them?", "Apply Settings", MessageBoxButtons.YesNo);
                if (dialogResult == DialogResult.Yes)
                {
                    // apply settings
                    needs_apply = false;

                    mon1_orient_buffer = mon1_orient;
                    mon1_res_buffer = mon1_res;
                    mon1_refresh_buffer = mon1_refresh;

                    mon2_orient_buffer = mon2_orient;
                    mon2_res_buffer = mon2_res;
                    mon2_refresh_buffer = mon2_refresh;

                    tabControl1.SelectTab(graph_tab);
                }
                else if (dialogResult == DialogResult.No)
                {
                    needs_apply = false;

                    mon1_orient = mon1_orient_buffer;
                    mon1_res = mon1_res_buffer;
                    mon1_refresh = mon1_refresh_buffer;

                    mon2_orient = mon2_orient_buffer;
                    mon2_res = mon2_res_buffer;
                    mon2_refresh = mon2_refresh_buffer;

                    tabControl1.SelectTab(graph_tab);
                }
            } else
            {
                tabControl1.SelectTab(graph_tab);
            }
        }

        private void pictureBox4_Click(object sender, EventArgs e)
        {
            label5.BackColor = Color.FromArgb(28, 28, 28);
            label5.Text = "";

            label6.BackColor = Color.FromArgb(28, 28, 28);
            label6.Text = "";

            label7.BackColor = Color.FromArgb(28, 28, 28);
            label7.Text = "";

            label8.BackColor = Color.FromArgb(118, 185, 0); 
            label8.Text = "";

            if (needs_apply)
            {
                DialogResult dialogResult = MessageBox.Show("You have unsaved changes.\nDo you want to apply them?", "Apply Settings", MessageBoxButtons.YesNo);
                if (dialogResult == DialogResult.Yes)
                {
                    // apply settings
                    needs_apply = false;

                    mon1_orient_buffer = mon1_orient;
                    mon1_res_buffer = mon1_res;
                    mon1_refresh_buffer = mon1_refresh;

                    mon2_orient_buffer = mon2_orient;
                    mon2_res_buffer = mon2_res;
                    mon2_refresh_buffer = mon2_refresh;

                    tabControl1.SelectTab(settings_tab);
                }
                else if (dialogResult == DialogResult.No)
                {
                    needs_apply = false;

                    mon1_orient = mon1_orient_buffer;
                    mon1_res = mon1_res_buffer;
                    mon1_refresh = mon1_refresh_buffer;

                    mon2_orient = mon2_orient_buffer;
                    mon2_res = mon2_res_buffer;
                    mon2_refresh = mon2_refresh_buffer;

                    tabControl1.SelectTab(settings_tab);
                }
            } else
            {
                tabControl1.SelectTab(settings_tab);
            }
        }

        private void label8_Click(object sender, EventArgs e)
        {

        }

        int current_screen = 1;

        int mon1_res = 1;
        int mon1_res_default = 1;
        int mon1_res_buffer = 1;

        int mon2_res = 1;
        int mon2_res_default = 1;
        int mon2_res_buffer = 1;

        int mon1_orient = 0;
        int mon1_orient_default = 0;
        int mon1_orient_buffer = 0;

        int mon2_orient = 0;
        int mon2_orient_default = 0;
        int mon2_orient_buffer = 0;
        
        int mon1_refresh = 0;
        int mon1_refresh_default = 0;
        int mon1_refresh_buffer = 0;

        int mon2_refresh = 0;
        int mon2_refresh_default = 0;
        int mon2_refresh_buffer = 0;

        bool needs_apply = false;

        private void pictureBox5_Click(object sender, EventArgs e)
        {

            label11.BackColor = Color.FromArgb(94, 140, 12);
            label12.BackColor = Color.FromArgb(94, 140, 12);
            label13.BackColor = Color.FromArgb(94, 140, 12);
            label14.BackColor = Color.FromArgb(94, 140, 12);

            label15.BackColor = Color.FromArgb(28, 28, 28);
            label16.BackColor = Color.FromArgb(28, 28, 28);
            label17.BackColor = Color.FromArgb(28, 28, 28);
            label18.BackColor = Color.FromArgb(28, 28, 28);

            current_screen = 1;
            label43.Text = "Monitor 1";

            comboBox1.SelectedIndex = mon1_res;
            comboBox2.SelectedIndex = mon1_orient;
            comboBox3.SelectedIndex = mon1_refresh;

            if (mon1_orient != mon1_orient_buffer || mon1_res != mon1_res_buffer || mon1_refresh != mon1_refresh_buffer)
            {
                needs_apply = true;
            } else
            {
                needs_apply = false;
            }

        }

        private void pictureBox6_Click(object sender, EventArgs e)
        {
            label11.BackColor = Color.FromArgb(28, 28, 28);
            label12.BackColor = Color.FromArgb(28, 28, 28);
            label13.BackColor = Color.FromArgb(28, 28, 28);
            label14.BackColor = Color.FromArgb(28, 28, 28);

            label15.BackColor = Color.FromArgb(94, 140, 12);
            label16.BackColor = Color.FromArgb(94, 140, 12);
            label17.BackColor = Color.FromArgb(94, 140, 12);
            label18.BackColor = Color.FromArgb(94, 140, 12);

            current_screen = 2;
            label43.Text = "Monitor 2";

            comboBox1.SelectedIndex = mon2_res;
            comboBox2.SelectedIndex = mon2_orient;
            comboBox3.SelectedIndex = mon2_refresh;

            if (mon2_orient != mon2_orient_buffer || mon2_res != mon2_res_buffer || mon2_refresh != mon2_refresh_buffer)
            {
                needs_apply = true;
            } else
            {
                needs_apply = false;
            }

        }

        private void button1_Click(object sender, EventArgs e)
        {
            DialogResult dialogResult = MessageBox.Show("Are you sure you want to restore default values?", "Yes", MessageBoxButtons.YesNo);

            if (dialogResult == DialogResult.Yes)
            {
                mon1_orient = mon1_orient_default;
                mon1_res = mon1_res_default;
                mon1_refresh = mon1_refresh_default;

                mon2_orient = mon2_orient_default;
                mon2_res = mon2_res_default;
                mon2_refresh = mon2_refresh_default;

                mon1_orient_buffer = mon1_orient_default;
                mon1_res_buffer = mon1_res_default;
                mon1_refresh_buffer = mon1_refresh_default;

                mon2_orient_buffer = mon2_orient_default;
                mon2_res_buffer = mon2_res_default;
                mon2_refresh_buffer = mon2_refresh_default;

                if (current_screen == 1)
                {
                    comboBox1.SelectedIndex = mon1_res;
                    comboBox2.SelectedIndex = mon1_orient;
                    comboBox3.SelectedIndex = mon1_refresh;
                }
                else if (current_screen == 2)
                {
                    comboBox1.SelectedIndex = mon2_res;
                    comboBox2.SelectedIndex = mon2_orient;
                    comboBox3.SelectedIndex = mon2_refresh;
                }

                needs_apply = false;
            }
            else if (dialogResult == DialogResult.No)
            {
                // do nothing
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            DialogResult dialogResult = MessageBox.Show("Are you sure you want to apply settings?", "Apply Settings", MessageBoxButtons.YesNo);
            
            if (dialogResult == DialogResult.Yes)
            {
                // apply settings
                needs_apply = false;

                mon1_orient_buffer = mon1_orient;
                mon1_res_buffer = mon1_res;
                mon1_refresh_buffer = mon1_refresh;

                mon2_orient_buffer = mon2_orient;
                mon2_res_buffer = mon2_res;
                mon2_refresh_buffer = mon2_refresh;
            }
            else if (dialogResult == DialogResult.No)
            {
                // do nothing
            }
            
        }

        private void button3_Click(object sender, EventArgs e)
        {
            DialogResult dialogResult = MessageBox.Show("Are you sure you want to restore default values?", "Restore default values", MessageBoxButtons.YesNo);

            if (dialogResult == DialogResult.Yes)
            {
                comboBox4.SelectedIndex = 0;
                comboBox5.SelectedIndex = 0;
                comboBox6.SelectedIndex = 0;
                comboBox7.SelectedIndex = 0;
                comboBox8.SelectedIndex = 1;
                comboBox9.SelectedIndex = 0;
                comboBox10.SelectedIndex = 6;
                comboBox11.SelectedIndex = 2;
            }
            else if (dialogResult == DialogResult.No)
            {
                // do nothing
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            DialogResult dialogResult = MessageBox.Show("Are you sure you want to apply settings?", "Apply Settings", MessageBoxButtons.YesNo);
        }

        private void button6_Click(object sender, EventArgs e)
        {
            if (comboBox12.SelectedIndex != 0)
            {
                comboBox12.Items.RemoveAt(comboBox12.SelectedIndex);
                comboBox12.SelectedIndex = 0;
            }
        }

        private void button5_Click(object sender, EventArgs e)
        {
            OpenFileDialog openFileDialog1 = new OpenFileDialog();
            openFileDialog1.Filter = "Programs|*.exe|All Files (*.*)|*.*";
            openFileDialog1.FilterIndex = 1;
            openFileDialog1.Multiselect = false;

            DialogResult result = openFileDialog1.ShowDialog();

            if (result == DialogResult.OK)
            {
                string selectedFilePath = openFileDialog1.FileName;
                string programName = System.IO.Path.GetFileNameWithoutExtension(selectedFilePath);
                comboBox12.Items.Add(programName);
                comboBox12.SelectedIndex = comboBox12.Items.Count - 1;
            }
        }

        private async void label42_Click(object sender, EventArgs e)
        {
            tabControl2.SelectTab(tabPage1);
            comboBox8.Select();

            label5.BackColor = Color.FromArgb(28, 28, 28);
            label5.Text = "";

            label6.BackColor = Color.FromArgb(28, 28, 28);
            label6.Text = "";

            label7.BackColor = Color.FromArgb(118, 185, 0);
            label7.Text = "";

            label8.BackColor = Color.FromArgb(28, 28, 28);
            label8.Text = "";

            if (needs_apply)
            {
                DialogResult dialogResult = MessageBox.Show("You have unsaved changes.\nDo you want to apply them?", "Apply Settings", MessageBoxButtons.YesNo);
                if (dialogResult == DialogResult.Yes)
                {
                    // apply settings
                    needs_apply = false;

                    mon1_orient_buffer = mon1_orient;
                    mon1_res_buffer = mon1_res;
                    mon1_refresh_buffer = mon1_refresh;

                    mon2_orient_buffer = mon2_orient;
                    mon2_res_buffer = mon2_res;
                    mon2_refresh_buffer = mon2_refresh;

                    tabControl1.SelectTab(graph_tab);
                }
                else if (dialogResult == DialogResult.No)
                {
                    needs_apply = false;

                    mon1_orient = mon1_orient_buffer;
                    mon1_res = mon1_res_buffer;
                    mon1_refresh = mon1_refresh_buffer;

                    mon2_orient = mon2_orient_buffer;
                    mon2_res = mon2_res_buffer;
                    mon2_refresh = mon2_refresh_buffer;

                    tabControl1.SelectTab(graph_tab);
                }
            }
            else
            {
                tabControl1.SelectTab(graph_tab);
            }

            Color label28_forecolor = Color.FromArgb(235, 235, 235);
            Color label28_backcolor = Color.FromArgb(28, 28, 28);

            Color label28_invert_fore = Color.FromArgb(28, 28, 28);
            Color label28_invert_back = Color.FromArgb(235, 235, 235);

            label28.ForeColor = label28_invert_fore;
            label28.BackColor = label28_invert_back;

            for (int i = 0; i < 20; i++)
            {
                await Task.Delay(50);
                label28.ForeColor = Color.FromArgb(label28_invert_fore.R + (label28_forecolor.R - label28_invert_fore.R) * i / 20, label28_invert_fore.G + (label28_forecolor.G - label28_invert_fore.G) * i / 20, label28_invert_fore.B + (label28_forecolor.B - label28_invert_fore.B) * i / 20);
                label28.BackColor = Color.FromArgb(label28_invert_back.R + (label28_backcolor.R - label28_invert_back.R) * i / 20, label28_invert_back.G + (label28_backcolor.G - label28_invert_back.G) * i / 20, label28_invert_back.B + (label28_backcolor.B - label28_invert_back.B) * i / 20);
            }

            label28.ForeColor = label28_forecolor;
            label28.BackColor = label28_backcolor;
        }

        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (current_screen == 1)
            {
                mon1_orient = comboBox2.SelectedIndex;
                
                if (comboBox2.SelectedIndex == 0)
                {
                    pictureBox5.Image = Properties.Resources.monitor_11;
                } else if (comboBox2.SelectedIndex == 1)
                {
                    pictureBox5.Image = Properties.Resources.good_portrait1;
                }
            }
            else if (current_screen == 2)
            {
                mon2_orient = comboBox2.SelectedIndex;

                if (comboBox2.SelectedIndex == 0)
                {
                    pictureBox6.Image = Properties.Resources.monitor_2;
                }
                else if (comboBox2.SelectedIndex == 1)
                {
                    pictureBox6.Image = Properties.Resources.good_portrait2;
                }
            }

            needs_apply = true;
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (current_screen == 1)
            {
                mon1_res = comboBox1.SelectedIndex;
            }
            else if (current_screen == 2)
            {
                mon2_res = comboBox1.SelectedIndex;
            }

            needs_apply = true;
        }

        private void comboBox3_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (current_screen == 1)
            {
                mon1_refresh = comboBox3.SelectedIndex;
            }
            else if (current_screen == 2)
            {
                mon2_refresh = comboBox3.SelectedIndex;
            }

            needs_apply = true;
        }

        private void ambient_hover(object sender, EventArgs e)
        {
            label44.Text = "Ambient Occlusion";
            label25.Text = "Ambient occlusion adds realism to scenes by reducing the intensity of ambient light on surfaces blocked by surrounding objects. It enhances depth perception by providing a soft shadow effect for objects based on their placement in the scene. This feature is not supported for all applications; refer to Program Settings to view per-application support. NVIDIA's Screen Space Ambient Occlusion algorithm is not compatible with DX12 games.";
            label46.Text = "Usage";
            label45.Text = "Quality provides a more pronounced increase in realism, though you may experience a decrease in graphics performace. \nPerformance increases realism with less impact on graphics performance.";
        }

        private void fxaa_hover(object sender, EventArgs e)
        {
            label44.Text = "Antialising - FXAA:";
            label25.Text = "FXAA is a fast shader-based post-processing technique that can be applied to any program, including those which do not support other forms of hardware-based antialiasing. FXAA can be used in conjunction with other antialiasing settings to improve overall image quality. Note that enabling this setting globally may affect all programs rendered on the GPU, including video players and the Windows desktop.";
            label46.Text = "Usage";
            label45.Text = "Turn FXAA on to improve image quality with a lesser performance impact than other antialiasing settings. \nTurn FXAA off if you notice artifacs or dithering around t he edges of objects, particularly around text.";
        }

        private void scaling_hover(object sender, EventArgs e)
        {
            label44.Text = "Image Scaling";
            label25.Text = "This feature enables GPU scaling and sharpening for your application.";
            label46.Text = "Usage";
            label45.Text = "Turn Image Scaling on to boost frames rates of your application. \nUse Sharpen to adjust the level of sharpness. \nUse Overlay Indicator to show if feature is enable for your application or properly captured in screeshots or videos";
        }

        private void fps_hover(object sender, EventArgs e)
        {
            label44.Text = "Max FPS";
            label25.Text = "Sets the maximum frame rate that the GPU will render a game or 3D application. Limiting the frame rate can be useful for extending battery life or reducing system latency in certain scenarios.";
            label46.Text = "Usage";
            label45.Text = "This setting is oftern enabled when users are trying to conserve power or limit the frames per second slightly below the refresh rate of ther G - SYNC display.";
        }

        private void latency_hover(object sender, EventArgs e)
        {
            label44.Text = "Low Latency Mode";
            label25.Text = "The Latency control reduces latency by limiting the number of frames the CPU can prepare before the frames are processed by the GPU.";
            label46.Text = "Usage";
            label45.Text = "Select OFF to prioritise render throughtput by allowing games to queue frames. \nSelect On to prioritise latency by limiting queued frames to 1. \nSelect Ultra to prioritise latency by fully minimising queued frams. In addition, this mode minimises VSYNC latency when both VSYNC and G-SYNC are enabled.";
        }

        private void cache_hover(object sender, EventArgs e)
        {
            label44.Text = "Shader Cache Size";
            label25.Text = "Controls the maximum amount of disk space the driver may use for storing shader compiles.";
            label46.Text = "Usage";
            label45.Text = "Shader compilation for applications can be skipped if the result of that compile can be found in the cache. This will reduce stuttering and startup time of applications.";
        }

        private void vsync_hover(object sender, EventArgs e)
        {
            label44.Text = "Vertical Sync";
            label25.Text = "Vertical sync is a collection of settings that control how the GPU render rate interfaces to the refresh rate of a monitor. This setting is applicable only when a display is connected to NVIDIA GPU.";
            label46.Text = "Usage";
            label45.Text = "Default 3D settings for your applications.";
        }

        private void comboBox12_SelectedIndexChanged(object sender, EventArgs e)
        {
            label34.Text = "Settings: " + comboBox12.SelectedItem.ToString();
        }
    }
}
