#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <errno.h>
#include <stdint.h>
#include <string.h>
#include <assert.h>

#include "linked-list.h"

namespace base {

   Node* destroy(Node* list)
   {
      Node *current = list;
      while (current != NULL) {
         Node *next = current->next;
         free(current->reg.name);
         free(current);
         current = next;
      }
      return NULL;
   }

   Node* append(Node* list, uint32_t nmec, char *name)
   {
      Node *newNode = (Node*) malloc(sizeof(Node));
      if (newNode == NULL) {
         fprintf(stderr, "Error: malloc() failed: %s\n", strerror(errno));
         exit(EXIT_FAILURE);
      }
      newNode->reg.nmec = nmec;
      newNode->reg.name = (char*) malloc(strlen(name) + 1);
      if (newNode->reg.name == NULL) {
         fprintf(stderr, "Error: malloc() failed: %s\n", strerror(errno));
         exit(EXIT_FAILURE);
      }
      strcpy(newNode->reg.name, name);
      newNode->next = list;
      return newNode;
   }

   void print(Node* list)
   {
      Node *current = list;
      while (current != NULL) {
         printf("%d %s\n", current->reg.nmec, current->reg.name);
         current = current->next;
      }
   }

   int exists(Node* list, uint32_t nmec)
   {
      Node *current = list;
      while (current != NULL) {
         if (current->reg.nmec == nmec) {
            return 1;
         }
         current = current->next;
      }
      return 0;
   }

   Node* remove(Node* list, uint32_t nmec)
   {
      Node *current = list;
      if (current == NULL) {
         return NULL;
      }
      if (current->reg.nmec == nmec) {
         Node *next = current->next;
         free(current->reg.name);
         free(current);
         return next;
      }
      while (current->next != NULL) {
         if (current->next->reg.nmec == nmec) {
            Node *next = current->next->next;
            free(current->next->reg.name);
            free(current->next);
            current->next = next;
            return list;
         }
         current = current->next;
      }
      return list;
   }

   const char *search(Node* list, uint32_t nmec)
   {
      Node *current = list;
      while (current != NULL) {
         if (current->reg.nmec == nmec) {
            return current->reg.name;
         }
         current = current->next;
      }
      return NULL;
   }

   Node* sort_by_name(Node* list)
   {
      Node *current = list;
      Node *sorted = NULL;
      while (current != NULL) {
         Node *next = current->next;
         sorted = append(sorted, current->reg.nmec, current->reg.name);
         free(current->reg.name);
         free(current);
         current = next;
      }
      return sorted;
   }

   Node* sort_by_number(Node* list)
   {
      Node *current = list;
      Node *sorted = NULL;
      while (current != NULL) {
         Node *next = current->next;
         sorted = append(sorted, current->reg.nmec, current->reg.name);
         free(current->reg.name);
         free(current);
         current = next;
      }
      return sorted;
   }
}
