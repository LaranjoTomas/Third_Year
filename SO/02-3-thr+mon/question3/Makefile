CXX = g++
CXXFLAGS = -Wall -Wfatal-errors -ggdb -pthread

TARGETS = main

.PHONY:	clean cleanall

all: $(TARGETS)

main: main.o utils.o bwdelay.o thread.o
	$(CXX) -o $@ $^ $(CXXFLAGS)
clean:
	rm -f *.o

cleanall:	clean
	rm -f $(TARGETS) 
