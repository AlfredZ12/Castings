package ObjetosNegocio;

import ObjetosNegocio.Cliente;
import ObjetosNegocio.Perfil;
import ObjetosNegocio.Presencial;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-03T17:14:19")
@StaticMetamodel(Casting.class)
public class Casting_ { 

    public static volatile SingularAttribute<Casting, String> descripcion;
    public static volatile SingularAttribute<Casting, Cliente> idCliente;
    public static volatile SingularAttribute<Casting, Float> costo;
    public static volatile SingularAttribute<Casting, Perfil> idPerfil;
    public static volatile SingularAttribute<Casting, Integer> idcasting;
    public static volatile SingularAttribute<Casting, Integer> clienteidCliente;
    public static volatile SingularAttribute<Casting, Date> fechacontratacion;
    public static volatile ListAttribute<Casting, Presencial> presencialList;
    public static volatile SingularAttribute<Casting, String> nombre;

}