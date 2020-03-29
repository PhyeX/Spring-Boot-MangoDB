package rce.springbootmangodb;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository){
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/all")
    public List<Hotel> getAll(){
       List<Hotel> hotels = this.hotelRepository.findAll();
       return hotels;
    }

    @PutMapping
    public void insert(@RequestBody Hotel hotel){
        this.hotelRepository.insert(hotel);
    }

    @PostMapping
    public void update(@RequestBody Hotel hotel){
        this.hotelRepository.save(hotel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        this.hotelRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Hotel getById(@PathVariable("id")String id){

        Hotel hotel = this.hotelRepository.findById(id).get();
        return hotel;
    }

    @GetMapping("/price/{maxPrice}")
    public List<Hotel> getByPricePerNight(@PathVariable("maxPrice") int maxPrice){
        List<Hotel> hotels = this.hotelRepository.findByPricePerNightIsLessThan(maxPrice);

        return hotels;
    }
    @GetMapping("/address/{city}")
    public List<Hotel> getByCity(@PathVariable("city")String city){
        List<Hotel> hotels = this.hotelRepository.findByCity(city);
        return hotels;
    }

     @GetMapping("/country/{country}")
    public List<Hotel> getByCountry(@PathVariable("country")String country){
        List<Hotel> hotels = this.hotelRepository.findByCountry(country);
        return hotels;
    }
    
}
