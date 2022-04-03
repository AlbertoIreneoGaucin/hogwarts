package edu.tcu.cs.hogwartsartifactsonline.controller;

import edu.tcu.cs.hogwartsartifactsonline.domain.Artifact;
import edu.tcu.cs.hogwartsartifactsonline.domain.Result;
import edu.tcu.cs.hogwartsartifactsonline.domain.StatusCode;
import edu.tcu.cs.hogwartsartifactsonline.service.ArtifactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artifacts")
public class ArtifactController {
    private ArtifactService artifactService;

    public ArtifactController(ArtifactService artifactService) {
        this.artifactService = artifactService;
    }

    @GetMapping
    public Result findAll(){
        List<Artifact> all = artifactService.findALl();
        Result result = new Result(true, StatusCode.SUCCESS, "Find All Success", all);
        // behind the scenes Spring Boot will automatically serialize it into JSON
        return result;

    }
    @GetMapping("/{artifactId")
    public Result findById(@PathVariable String artifactId){
        return new Result(true, StatusCode.SUCCESS, "Find one success", artifactService.findById(artifactId));


    }
    // need RequestBody to do automatic binding
    @PostMapping
    public Result save(@RequestBody Artifact newArtifact){
        artifactService.save(newArtifact);
        return new Result(true, StatusCode.SUCCESS, "Save Success");
    }
    @PutMapping("/{artifactId}")
    public Result update(@PathVariable String artifactId, @RequestBody Artifact updatedArtifact){
        artifactService.update(artifactId, updatedArtifact);
        return new Result(true, StatusCode.SUCCESS, "Update Success");
    }

    @DeleteMapping("/{artifactId")
    public  Result delete(@PathVariable String artifactId){
        artifactService.delete(artifactId);
        return new Result(true, StatusCode.SUCCESS, "Delete Success");
    }




}
