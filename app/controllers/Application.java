package controllers;

import play.*;
import play.mvc.*;
import play.libs.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void upload() {
        String content = IO.readContentAsString(request.body);
        System.out.println(content);
    }

}
