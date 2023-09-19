#ifndef __SO_IPC_ULL_ // se não tiver defenido 
#define __SO_IPC_ULL_ // defenir, para garanti que é incluido só 1 vez

#include <stdint.h> // uint32_t, 32 bits

namespace base {
   // Student information:

   struct Student
   {
      uint32_t nmec;
      char *name;
   };

   // The linked-list support data structure:
   struct Node 
   {
      Student reg; // 4 bytes
      struct Node *next; // 
   };

   Node* destroy(Node* list);
   Node* append(Node* list, uint32_t nmec, char *name);
   void print(Node* list);
   int exists(Node* list, uint32_t nmec); // returns 0 (false) if it does not exist, 1 (true) if exists
   Node* remove(Node* list, uint32_t nmec);
   const char *search(Node* list, uint32_t nmec);
   Node* sort_by_name(Node* list);
   Node* sort_by_number(Node* list);
}

#endif /* __SO_IPC_ULL_ */
