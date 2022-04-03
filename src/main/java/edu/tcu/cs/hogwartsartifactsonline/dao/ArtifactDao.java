package edu.tcu.cs.hogwartsartifactsonline.dao;

import edu.tcu.cs.hogwartsartifactsonline.domain.Artifact;
import org.springframework.data.jpa.repository.JpaRepository;
//this is all you need, spring data module will do the crud operations for you
public interface ArtifactDao extends JpaRepository<Artifact, String> {
}
