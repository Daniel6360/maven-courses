package ro.itschool.curs16;

import java.nio.file.AccessDeniedException;

public class CheckedExceptionMain {
    public static void main(String[] args) {



    }
    private static void throwsCheckedException() throws Exception{
        throw new AccessDeniedException("this is checked");
    }
}
