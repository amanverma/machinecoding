MVC stands for Model-View-Controller. This pattern is used for separating the application’s concerns as listed below: #SEPARATION OF CONCERNS#

1. Model - This represents the object (Java POJO) that carries the data. It can also consist of the logic of updating the controller in case the data changes.

2. View - This represents the data visualization of the model.

3. Controller - This is an interface between the Model and the View by controlling the flow of data into the model and updating the view whenever the model gets updated. This ensures that the model and the views are kept separate.


                        BROWSER LAYER (sends request to controller)

        MODEL LAYER(gathers data from controller and updates back controller) -------   CONTROLLER LAYER -----renders --->   VIEW LAYER (send result back to browser)


First, the Browser (client) sends request for a page to the controller of the server. The controller invokes the model, retrieves the data and sends the response. The response is then sent to the view for rendering. The view will be rendered and it is sent back to the client for display.


