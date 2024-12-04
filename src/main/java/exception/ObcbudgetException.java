
package exception;

import java.io.Serializable;


public class ObcbudgetException extends RuntimeException implements Serializable{
    // code d'erreur
    private int code;

    public ObcbudgetException(int code) {
        super();
        this.code = code;
     }

    public ObcbudgetException(String message, int code) {
        super(message);
        this.code = code;
     }

    public ObcbudgetException(Throwable cause, int code) {
        super(cause);
        this.code = code;
        //System.out.println("Erreur n°"+code+", cause="+cause);
     }

    public ObcbudgetException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
     }

    // getter et setter

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
}
