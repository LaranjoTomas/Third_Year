CXX = g++
CXXFLAGS = -Wall -Wfatal-errors -ggdb -pthread

TARGETS = main

.PHONY:	clean cleanall

all: $(TARGETS)

main: main.o process.o utils.o
	$(CXX) -o $@ $^ $(CXXFLAGS)
clean:
	rm -f *.o

cleanall:	clean
	rm -f $(TARGETS) 
