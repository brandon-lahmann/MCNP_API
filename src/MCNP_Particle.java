import java.util.Vector;

/**
 * Created by lahmann on 06/05/2015.
 * TODO: Ideally would like a cleaner way to handle the physics cards
 * TODO: In reality there are only 5 unique physics cards. Perhaps 5 classes is the way to go
 */
public class MCNP_Particle extends MCNP_Object {

    public static MCNP_Particle neutron(){
        return new MCNP_Particle("Neutron", "n", 0, 1);
    }

    public static MCNP_Particle photon(){
        return new MCNP_Particle("Photon", "p", 0, 0);
    }

    public static MCNP_Particle electron(){
        return new MCNP_Particle("Electron", "e", -1, 0);
    }

    public static MCNP_Particle proton(){
        return new MCNP_Particle("Proton", "H", 1, 1);
    }

    private String name;
    private String id;
    private Integer Z;
    private Integer A;
    private Vector<Object> physicsOptions;

    public MCNP_Particle(String name, String id, Integer Z, Integer A){
        this.name = name;
        this.id = id;
        this.Z = Z;
        this.A = A;
        this.physicsOptions = new Vector<Object>();
    }

    public MCNP_Particle(String name, Integer Z, Integer A){
        this(name, Integer.toString(1000*Z + A), Z, A);
    }

    public MCNP_Particle(Integer Z, Integer A){
        this("Unnamed Particle", Integer.toString(1000*Z + A), Z, A);
    }

    public void setPhysicsOptions(Object ... options){
        for(Object option : options){
            physicsOptions.add(option);
        }
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getPhysicsCard(){
        String card = new String();

        if(physicsOptions.isEmpty())
            return card;

        card = "PHYS:" + this.id + " ";

        for(Object option : physicsOptions){
            if(option.getClass() == D)
        }



    }


}
