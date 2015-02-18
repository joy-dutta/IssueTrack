package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
	  System.out.println("Hello Joy");
    return ok(index.render("Joy's new play application is ready."));

  }
  
}