package to.ares.gamecenter.games.snowwar;

import to.ares.gamecenter.games.snowwar.objects.GameItemObject;
import to.ares.gamecenter.games.snowwar.pathfinding.SpawnPoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Arena {
	public int arenaHeight;
	public int arenaType;
	public int arenaWidth;

	public String heightMap;

	public List<GameFuseObject> fuseObjects = new ArrayList<GameFuseObject>(200);

	public List<SpawnPoint> spawnsBLUE = new ArrayList<SpawnPoint>(5);
	public List<SpawnPoint> spawnsRED = new ArrayList<SpawnPoint>(5);

	public abstract void gameObjects(Map<Integer, GameItemObject> gameObjects, SnowWarRoom room);
}
