package com.learningjenkins;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String hostServer = System.getenv("HOST_SERVER");
        String buildId = System.getenv("BUILD_ID");
        System.out.println("(custom defiend env v)host server = " + hostServer);
        System.out.println("(predefined env v)build Id = " + buildId);
        return ; 
    }
}
