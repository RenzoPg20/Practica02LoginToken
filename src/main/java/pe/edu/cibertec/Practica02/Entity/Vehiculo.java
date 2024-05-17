package pe.edu.cibertec.Practica02.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor

@Entity
@Table(name = "vehicle")
public class Vehiculo {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

private String brand;

private String model;

private String color;



}
