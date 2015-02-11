package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
	  System.out.println("Hiiii Pramita");
	  
    return ok(index.render("Pramita's new application is not ready."));
  }
  
}