
package factorymethod;

/**
 * @author spart
 */
public class Oppilas extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Maito();
    };

}
