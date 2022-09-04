package com.mrth.excepcion;

public class ErrorFisicoException extends Exception{
    public ErrorFisicoException(Exception ex) {
        super("Ocurrió un Error Físico", ex);
    }
}
