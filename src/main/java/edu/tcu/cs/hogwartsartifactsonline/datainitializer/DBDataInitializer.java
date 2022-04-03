package edu.tcu.cs.hogwartsartifactsonline.datainitializer;

import edu.tcu.cs.hogwartsartifactsonline.dao.ArtifactDao;
import edu.tcu.cs.hogwartsartifactsonline.domain.Artifact;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBDataInitializer implements CommandLineRunner {
    private ArtifactDao artifactDao;

    public DBDataInitializer(ArtifactDao artifactDao) {
        this.artifactDao = artifactDao;
    }

    @Override
    public void run(String... args) throws Exception{
        Artifact a1 = new Artifact();
        a1.setId("1250808601736515584");
        a1.setName("Deluminator");
        a1.setDescription("A Deluminator is a device invented by Albus Dumbledore");
        a1.setImageURL("imageUrl");

        Artifact a2 = new Artifact();
        a2.setId("1250808601736515585");
        a2.setName("I cloak");
        a2.setDescription("A Deluminator is a device invented by Albus Dumbledore");
        a2.setImageURL("imageUrl");

        Artifact a3 = new Artifact();
        a3.setId("1250808601736515586");
        a3.setName("Elder wand");
        a3.setDescription("A Deluminator is a device invented by Albus Dumbledore");
        a3.setImageURL("imageUrl");

        Artifact a4 = new Artifact();
        a4.setId("1250808601736515587");
        a4.setName("number 4");
        a4.setDescription("A Deluminator is a device invented by Albus Dumbledore");
        a4.setImageURL("imageUrl");

        Artifact a5 = new Artifact();
        a5.setId("1250808601736515588");
        a5.setName("number 5");
        a5.setDescription("A Deluminator is a device invented by Albus Dumbledore");
        a5.setImageURL("imageUrl");

        Artifact a6 = new Artifact();
        a6.setId("1250808601736515589");
        a6.setName("number 6");
        a6.setDescription("A Deluminator is a device invented by Albus Dumbledore");
        a6.setImageURL("imageUrl");

        artifactDao.save(a1);
        artifactDao.save(a2);
        artifactDao.save(a3);
        artifactDao.save(a4);
        artifactDao.save(a5);
        artifactDao.save(a6);

    }


}
