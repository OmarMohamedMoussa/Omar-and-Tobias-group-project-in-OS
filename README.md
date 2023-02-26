# Omar-and-Tobias-group-project-in-OS
Group project tasks done by Omar and Tobias in OS

-------------------------------------------------------------------
### Theory
The assignemnt 2 theory is based on the idea about synchronization
when it comes to processing multiple requests at once. Since they
can end up conflicting if multiple threads are working with the
same variables at once. In this assignment we have availableSeats
variable which is supposed to be number of availeble seats at a
theater. However these are limited, and we are getting multiple
requests for these seats at once. And we have to make sure these
don't overlap so we dont end up overbooking the theater.

How do we do this? In java we can syncronize these methods and
variables so that all the threads can't perform them seperately
and they all are working with the same variable at the same time
this way the theater doesn't get overbooked.

-------------------------------------------------------------------
### Observations

-------------------------------------------------------------------
### How to run
Just clone this repository with your favorite IDE and run the
Main.java class.
