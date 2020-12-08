////////////////////////////////////////////////////////////////////
// [Samuele] [Sartor] [1187588]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.business.exception;
public class TakeAwayBillException extends Throwable {
    private String mess;


    public TakeAwayBillException(String exc){
        mess = exc;
    }

    public String getMessage(){
        return mess;
    }
}

