CXX = g++
CXXFLAGS = -Wall -Wfatal-errors -ggdb -pthread

TARGETS = main

.PHONY:	all clean cleanall

all: $(TARGETS)

main: main.o utils.o thread.o
	$(CXX) -o $@ $^ $(CXXFLAGS)

clean:
	rm -f *.o

cleanall:	clean
	rm -f $(TARGETS) 
