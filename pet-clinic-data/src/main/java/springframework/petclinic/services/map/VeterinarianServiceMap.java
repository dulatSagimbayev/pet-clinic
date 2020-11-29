package springframework.petclinic.services.map;

import springframework.petclinic.model.Pet;
import springframework.petclinic.model.Veterinarian;
import springframework.petclinic.services.CrudService;

import java.util.Set;

public class VeterinarianServiceMap extends AbstractMapService<Veterinarian,Long> implements CrudService<Veterinarian,Long> {
    @Override
    public Set<Veterinarian> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Veterinarian object) {
        super.delete(object);
    }

    @Override
    public Veterinarian save(Veterinarian object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Veterinarian findById(Long id) {
        return super.findById(id);
    }
}
