package org.OmkarGaikwad.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.OmkarGaikwad.messenger.database.DatabaseClass;
import org.OmkarGaikwad.messenger.model.Profile;

public class ProfileService {

private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService() {
		profiles.put("omkar", new Profile(1L, "omkar", "omkar", "gaikwad"));
		profiles.put("sunita", new Profile(2L, "sunita", "sunita", "gaikwad"));
		profiles.put("gajanan", new Profile(3L, "gajanan", "gajanan", "gaikwad"));
	}
	
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values()); 
	}
	
	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		if (profile.getProfileName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removeProfile(String profileName) {
		return profiles.remove(profileName);
	}
}
