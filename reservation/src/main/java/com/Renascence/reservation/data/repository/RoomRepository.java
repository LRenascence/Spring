package com.Renascence.reservation.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.Renascence.reservation.data.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{

}
