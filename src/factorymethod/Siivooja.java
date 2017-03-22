
package factorymethod;

/**
 * @author spart
 */
public class Siivooja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Mehu();
    };

}
