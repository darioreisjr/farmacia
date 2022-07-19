package com.generation.progetoFarmacia.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.progetoFarmacia.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	/**
	 * Método que busca um usuário pelo seu usuario (email).
	 * 
	 * Método criado para checar se o usuário já existe no banco de dados select *
	 * from tb_usuarios where usuario = "usuario procurado"
	 */
	public Optional<Usuario> findByUsuario(String usuario);

	/**
	 * Método criado para a Sessão de testes
	 */
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
}
