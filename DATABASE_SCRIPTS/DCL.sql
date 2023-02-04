use pp;
GRANT INSERT , SELECT 
ON questionmanagement TO sakila;            #use of grant to give permisson

REVOKE SELECT , INSERT 
ON questionmanagement FROM sakila;               #use of revoke to withdraw permission from user