package fr.simplon.picone.service;

import fr.simplon.picone.Model.Mot;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MotService {

    List<Mot> findNodes();

    List<Mot> findByIdAndByRelation(Long id, String relation);

    Optional<Mot> findNodesById(Long id);
}
