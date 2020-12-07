package ObjetosNegocio;

import ObjetosNegocio.Casting;
import ObjetosNegocio.Personacontacto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-03T17:14:19")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile SingularAttribute<Cliente, Personacontacto> idPersonaContacto;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile ListAttribute<Cliente, Casting> castingList;

}