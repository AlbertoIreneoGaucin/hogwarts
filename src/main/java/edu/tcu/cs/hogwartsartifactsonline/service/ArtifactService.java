package edu.tcu.cs.hogwartsartifactsonline.service;

import edu.tcu.cs.hogwartsartifactsonline.dao.ArtifactDao;
import edu.tcu.cs.hogwartsartifactsonline.domain.Artifact;
import edu.tcu.cs.hogwartsartifactsonline.utils.IdWorker;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ArtifactService {
    private ArtifactDao artifactDao;
    private IdWorker idWorker;


    // bu having this contructor, Spring will automatically inject an instance of ArtifactDao into this class
    public ArtifactService(ArtifactDao artifactDao, IdWorker idWorker) {
        this.artifactDao = artifactDao;
        this.idWorker = idWorker;
    }

    public List<Artifact> findAll(){
        return artifactDao.findAll();
    }
    public Artifact findById(String artifactId){
        return artifactDao.findById(artifactId).get();
    }
    public void save(Artifact newArtifact)
    {
        // before we save it we have to provide Id
        newArtifact.setId(idWorker.nextId() + "");
        artifactDao.save(newArtifact);
    }
    public void update(String artifactId, Artifact updatedArtifact){
        updatedArtifact.setId(artifactId);
        // smaart enogh to tell if it is new or not, will change sql based on this fact
        artifactDao.save(updatedArtifact);
    }
    public void delete(String artifactId){
        artifactDao.deleteById(artifactId);
    }

}
