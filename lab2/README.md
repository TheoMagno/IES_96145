REVIEW QUESTIONS:

- A) A servlet container generates dynamic web pages. It communicates between browsers and servlets. A servlet container works like this:
    * A client access a server for a page;
    * The server redirects the request to the container;
    * The servlet container redirects it to the appropriate servlet;
    * The servlet is dynamically retrieved and loaded into the container, if it is not already there;
    * The container invokes the init() method when the servlet is loaded for the first time;
    * The container invokes the service() method to process the request (read the request and generate a response). The servlet remains into the container and can process other requests;
    * Web servlet generates data and return the results to the correct location.
    So, the importance of the servlet container is to obtain a request from the browser and generate a response.
- B) The Spring Boot uses Model-View-Controller like this:
    * The incoming requests are intercepted by the DispatcherServlet that works as a front controller;
    * The DispatcherServlet gets an entry of handler mapping from the XML file and forwards the request to the controller;
    * The controller returns an object of ModelAndView;
    * The DispatcherServlet checks the entry of view resolver in the XML file and invokes the specified view component.
- C) Its role is to permit the web application to use Spring Web, in order to use RESTful applications using Spring MVC.
- D) The @SpringBootApplication includes:
    * @Configuration to enable Java-based configuration
    * @ComponentScan to enable component scanning
    * @EnableAutoConfiguration to enable Spring Boot's auto-configuration feature.
- E) 
    * Accept and respond with JSON: it is important to use JSON because it is a text-based notation, which makes it easy to read by humans and machines.
    * Name collections with plural nouns: it makes easier to know when the result needs to have more than 1 element as result.
    * Use logical nesting on endpoints: when informations are embedded it is great to nest them on endpoints, in order to avoid mirroring information in the database.
    * Handle errors gracefully and return standard error codes: if an erro occurs it has to be handled, so if it is gracefully handled and a standard error code is returned the error becomes more visible and easier to avoid.
    * Versioning our APIs: creating different versions of an API is important to avoid problems with the clients when a change is made. For example, if an element's format is changed or information is added some clients may have problems to retrieve the desired information. With different versions the client may use the API the same way it has been using or adapt its program to the new version.
        