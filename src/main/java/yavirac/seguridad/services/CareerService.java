package yavirac.seguridad.services;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import yavirac.seguridad.models.Career;
import yavirac.seguridad.repository.CareerRepository;
@Service
public class CareerService{

    @Autowired
    public CareerRepository careerRepository;

    public Career createCareer(Career career){
        return careerRepository.save(career);
    }
    public Career updateCareer(Career career){
        return careerRepository.save (career);

    }
    public void deleteCareer(Long careerId){
         careerRepository.deleteById(careerId);

    }
    public void getCareer(Long career){
         careerRepository.deleteById(career);
    }
    
}
