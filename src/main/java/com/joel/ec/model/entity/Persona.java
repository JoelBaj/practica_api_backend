package com.joel.ec.model.entity;

import jakarta.persistence.*;

import lombok.*;
import org.hibernate.mapping.Map;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name="personas")
public class Persona implements Serializable {

    @Id
    @Column(name = "id_persona")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPersona;

    @Column(name= "nombre", length = 60)
    private String Nombre;
    @Column(name= "apellido", length = 60)
    private String Apellido;
    @Column(name= "identificacion", length = 20)
    private String Identificacion;
    @Column(name= "fecha_nacimiento")
    private Date FechaNacimiento;

    @OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
    private List<Usuario> usuario;

}
