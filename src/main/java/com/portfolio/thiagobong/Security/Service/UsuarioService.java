/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.thiagobong.Security.Service;

import com.portfolio.thiagobong.Security.Entity.Usuario;
import com.portfolio.thiagobong.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getBynombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }
}
