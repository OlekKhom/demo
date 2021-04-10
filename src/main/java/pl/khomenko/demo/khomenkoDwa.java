package pl.khomenko.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class khomenkoDwa {

    @Autowired
    LogiRepository logiRepository;

    @GetMapping(value = "/test3")
    public Iterable<LogiAcc> LogiAcc2(){
        return logiRepository.findAll();
    }

    @GetMapping(value = "/test3/{id}")
    public LogiAcc logiAcc(@PathVariable long id){
        return logiRepository.findById(id).get();
    }

    @PostMapping(value = "/test3/")
    public long methodlog(@RequestBody AccauntList accauntList){
        LogiAcc logiAcc = new LogiAcc(0, accauntList.getLogin(), accauntList.getPasword());
        LogiAcc save = logiRepository.save(logiAcc);
        return save.getId();
    }



    @GetMapping
    public String myGet(){
        return "Hello World";
    }

    @PostMapping ("/second/point")
    public int myPost(){
        return 3003;
    }

    @PutMapping ("/accaunt/{nameID}")
    public String myPutAccaunt (@PathVariable String nameID){
        return nameID;
    }

    @DeleteMapping("/accaunt/{nameID}")
    public String myDeletAccaunt (@PathVariable String nameID, @RequestParam int paswors, @RequestParam float weight){
        return nameID + " " + paswors + " " + weight;
    }

    @PutMapping("/accaunt2/{login}")
    public String myPutAccaunt2 (@PathVariable String login, @RequestParam int paswors, @RequestHeader String info){
        return login + " " + paswors + " " + info;
    }

    @PostMapping("/accaunt2")
    public AccauntList logowanie(@RequestBody AccauntList logowanie){
        return logowanie;
    }

    @GetMapping(value = "/test2")
    public AccauntList olek(){
        return new AccauntList("olekLogin", 474473);
    }


}
