package games.example.P4ndagamesRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import games.example.P4ndagamesModel.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    public List<Categoria> findAllByNomeContainingIgnoreCase(String nome);

}
