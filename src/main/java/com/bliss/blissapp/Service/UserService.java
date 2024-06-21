package com.bliss.blissapp.Service;

import com.bliss.blissapp.Model.Location;
import com.bliss.blissapp.Model.User;
import com.bliss.blissapp.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;

  List<User> findUserNearby(Location currentLocation, double distance) {
    return userRepository.findAll().stream()
        .filter(user -> user.getLocation() != null)
        .filter(user -> user.getLocation().withinDistance(currentLocation, distance))
        .collect(Collectors.toList());
  }
}
