package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
	  System.out.println("Hello Papia");
    return ok(index.render("Papia new play application is ready."));

  }
  
}