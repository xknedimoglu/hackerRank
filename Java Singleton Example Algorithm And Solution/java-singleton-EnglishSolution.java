import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    
    public static String str = null;
    public static Singleton str2= null; // singleton object
    
    private Singleton(){
        // private singleton constructor
    }
    public static Singleton getSingleInstance() //public static function getSingleInstance
    {        
        if(str == null){
            str2 = new Singleton();
        }
       return str2;
    } 

}