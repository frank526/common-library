package com.prueba.common_library.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto {

    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private String rol;
    private String userName;
    
}
