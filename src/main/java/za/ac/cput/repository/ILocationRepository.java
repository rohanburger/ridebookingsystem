package za.ac.cput.repository;

import za.ac.cput.domain.Location;

import java.util.List;

public interface ILocationRepository extends IRepository<Location, String>{
    List<Location> getAll();
}
