package com.surabhi.exceptions;

public class Main {
    public static void main(String[] args) {
        try {
//            int a=5;
//            int b=0;
//            divide(a,b);
            throw new MyException("hahaha exception ");
            // strict exceptions are put 1st because if we put Exception 1st  then it handles every exception
        } catch(MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage() + e.getClass());
        } catch (Exception e){
            System.out.println(e.getMessage() + e.getClass());
        }

        finally{
            System.out.println("this will always execute");
        }
    }
    //throws means it may throw an exception
    static int divide(int a, int b) throws ArithmeticException, Exception{
        if(b==0) throw new ArithmeticException("please do not divede by zero");
        return a/b;
    }
}
