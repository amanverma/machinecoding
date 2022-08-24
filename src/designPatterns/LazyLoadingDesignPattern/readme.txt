Lazy loading is a concept where we delay the loading of object until the point where we need it.

Lazy loading is just a fancy name given to the process of initializing a class when it’s actually needed.

In simple words, Lazy loading is a software design pattern where the initialization of an object occurs only when it is actually needed and not before to preserve simplicity of usage and improve performance.

Lazy loading is essential when the cost of object creation is very high and the use of the object is very rare. So this is the scenario where it’s worth implementing lazy loading.The fundamental idea of lazy loading is to load object/data when needed.

Real life example:

For Example, Suppose You are creating an application in which there is a Company object and this object contains a list of employees of the company in a ContactList object. There could be thousands of employees in a company. Loading the Company object from the database along with the list of all its employees in the ContactList object could be very time consuming.

In some cases you don’t even require the list of the employees, but you are forced to wait until the company and its list of employees loaded into the memory.

One way to save time and memory is to avoid loading of the employee objects until required and this is done using the Lazy Loading Design Pattern.