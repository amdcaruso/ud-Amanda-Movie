package com.example.chibichibibr.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;

import com.example.chibichibibr.myapplication.model.Movie;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView movieRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieRecyclerView = (RecyclerView) findViewById(R.id.movie_list);

        Context context = MainActivity.this;
        Class destinationActivity = MovieActivity.class;

        Intent intent = new Intent(context, destinationActivity);
        intent.putExtra(MovieActivity.labelDetail, "information on the movie");
        startActivity(intent);

        List<Movie> movies = new ArrayList<>();
        MovieListAdapter adapter = new MovieListAdapter(movies);

        movieRecyclerView.setAdapter(adapter);
        movieRecyclerView.setLayoutManager(new GridLayoutManager(this , 2));

        movieRecyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });


        String json = "{\"page\":1,\"results\":[{\"poster_path\":\"\\/bbxtz5V0vvnTDA2qWbiiRC77Ok9.jpg\",\"adult\":false,\"overview\":\"Julia becomes worried about her boyfriend, Holt when he explores the dark urban legend of a mysterious videotape said to kill the watcher seven days after viewing. She sacrifices herself to save her boyfriend and in doing so makes a horrifying discovery: there is a \\\"movie within the movie\\\" that no one has ever seen before.\",\"release_date\":\"2017-02-01\",\"genre_ids\":[27],\"id\":14564,\"original_title\":\"Rings\",\"original_language\":\"en\",\"title\":\"Rings\",\"backdrop_path\":\"\\/biN2sqExViEh8IYSJrXlNKjpjxx.jpg\",\"popularity\":159.533213,\"vote_count\":211,\"video\":false,\"vote_average\":5.2},{\"poster_path\":\"\\/WLQN5aiQG8wc9SeKwixW7pAR8K.jpg\",\"adult\":false,\"overview\":\"The quiet life of a terrier named Max is upended when his owner takes in Duke, a stray whom Max instantly dislikes.\",\"release_date\":\"2016-06-18\",\"genre_ids\":[12,16,35,10751],\"id\":328111,\"original_title\":\"The Secret Life of Pets\",\"original_language\":\"en\",\"title\":\"The Secret Life of Pets\",\"backdrop_path\":\"\\/lubzBMQLLmG88CLQ4F3TxZr2Q7N.jpg\",\"popularity\":109.400417,\"vote_count\":2224,\"video\":false,\"vote_average\":5.8},{\"poster_path\":\"\\/e1mjopzAS2KNsvpbpahQ1a6SkSn.jpg\",\"adult\":false,\"overview\":\"From DC Comics comes the Suicide Squad, an antihero team of incarcerated supervillains who act as deniable assets for the United States government, undertaking high-risk black ops missions in exchange for commuted prison sentences.\",\"release_date\":\"2016-08-02\",\"genre_ids\":[28,80,14,878],\"id\":297761,\"original_title\":\"Suicide Squad\",\"original_language\":\"en\",\"title\":\"Suicide Squad\",\"backdrop_path\":\"\\/34dxtTxMHGKw1njHpTjDqR8UBHd.jpg\",\"popularity\":77.393884,\"vote_count\":4385,\"video\":false,\"vote_average\":5.9},{\"poster_path\":\"\\/jjBgi2r5cRt36xF6iNUEhzscEcb.jpg\",\"adult\":false,\"overview\":\"Twenty-two years after the events of Jurassic Park, Isla Nublar now features a fully functioning dinosaur theme park, Jurassic World, as originally envisioned by John Hammond.\",\"release_date\":\"2015-06-09\",\"genre_ids\":[28,12,878,53],\"id\":135397,\"original_title\":\"Jurassic World\",\"original_language\":\"en\",\"title\":\"Jurassic World\",\"backdrop_path\":\"\\/dkMD5qlogeRMiEixC4YNPUvax2T.jpg\",\"popularity\":74.992141,\"vote_count\":5987,\"video\":false,\"vote_average\":6.5},{\"poster_path\":\"\\/z09QAf8WbZncbitewNk6lKYMZsh.jpg\",\"adult\":false,\"overview\":\"Dory is reunited with her friends Nemo and Marlin in the search for answers about her past. What can she remember? Who are her parents? And where did she learn to speak Whale?\",\"release_date\":\"2016-06-16\",\"genre_ids\":[16,10751],\"id\":127380,\"original_title\":\"Finding Dory\",\"original_language\":\"en\",\"title\":\"Finding Dory\",\"backdrop_path\":\"\\/iWRKYHTFlsrxQtfQqFOQyceL83P.jpg\",\"popularity\":73.178133,\"vote_count\":2269,\"video\":false,\"vote_average\":6.7},{\"poster_path\":\"\\/hLudzvGfpi6JlwUnsNhXwKKg4j.jpg\",\"adult\":false,\"overview\":\"Taking place after alien crafts land around the world, an expert linguist is recruited by the military to determine whether they come in peace or are a threat.\",\"release_date\":\"2016-11-10\",\"genre_ids\":[18,878],\"id\":329865,\"original_title\":\"Arrival\",\"original_language\":\"en\",\"title\":\"Arrival\",\"backdrop_path\":\"\\/yIZ1xendyqKvY3FGeeUYUd5X9Mm.jpg\",\"popularity\":65.785226,\"vote_count\":2004,\"video\":false,\"vote_average\":6.8},{\"poster_path\":\"\\/rXMWOZiCt6eMX22jWuTOSdQ98bY.jpg\",\"adult\":false,\"overview\":\"Though Kevin has evidenced 23 personalities to his trusted psychiatrist, Dr. Fletcher, there remains one still submerged who is set to materialize and dominate all the others. Compelled to abduct three teenage girls led by the willful, observant Casey, Kevin reaches a war for survival among all of those contained within him—as well as everyone around him—as the walls between his compartments shatter apart.\",\"release_date\":\"2017-01-19\",\"genre_ids\":[18,27,53],\"id\":381288,\"original_title\":\"Split\",\"original_language\":\"en\",\"title\":\"Split\",\"backdrop_path\":\"\\/4G6FNNLSIVrwSRZyFs91hQ3lZtD.jpg\",\"popularity\":57.23512,\"vote_count\":634,\"video\":false,\"vote_average\":6.5},{\"poster_path\":\"\\/uSHjeRVuObwdpbECaXJnvyDoeJK.jpg\",\"adult\":false,\"overview\":\"A teenager finds himself transported to an island where he must help protect a group of orphans with special powers from creatures intent on destroying them.\",\"release_date\":\"2016-09-28\",\"genre_ids\":[14],\"id\":283366,\"original_title\":\"Miss Peregrine's Home for Peculiar Children\",\"original_language\":\"en\",\"title\":\"Miss Peregrine's Home for Peculiar Children\",\"backdrop_path\":\"\\/9BVHn78oQcFCRd4M3u3NT7OrhTk.jpg\",\"popularity\":50.471852,\"vote_count\":1371,\"video\":false,\"vote_average\":6.3},{\"poster_path\":\"\\/nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg\",\"adult\":false,\"overview\":\"Interstellar chronicles the adventures of a group of explorers who make use of a newly discovered wormhole to surpass the limitations on human space travel and conquer the vast distances involved in an interstellar voyage.\",\"release_date\":\"2014-11-05\",\"genre_ids\":[12,18,878],\"id\":157336,\"original_title\":\"Interstellar\",\"original_language\":\"en\",\"title\":\"Interstellar\",\"backdrop_path\":\"\\/xu9zaAevzQ5nnrsXN6JcahLnG4i.jpg\",\"popularity\":48.550225,\"vote_count\":7128,\"video\":false,\"vote_average\":8},{\"poster_path\":\"\\/wnVHDbGz7RvDAHFAsVVT88FxhrP.jpg\",\"adult\":false,\"overview\":\"When a wounded Christian Grey tries to entice a cautious Ana Steele back into his life, she demands a new arrangement before she will give him another chance. As the two begin to build trust and find stability, shadowy figures from Christian’s past start to circle the couple, determined to destroy their hopes for a future together.\",\"release_date\":\"2017-02-08\",\"genre_ids\":[18,10749],\"id\":341174,\"original_title\":\"Fifty Shades Darker\",\"original_language\":\"en\",\"title\":\"Fifty Shades Darker\",\"backdrop_path\":\"\\/1CLcXnKFdD1ZvS1lRX6XtSYT3RA.jpg\",\"popularity\":40.479871,\"vote_count\":330,\"video\":false,\"vote_average\":6.7},{\"poster_path\":\"\\/yNsdyNbQqaKN0TQxkHMws2KLTJ6.jpg\",\"adult\":false,\"overview\":\"Extreme athlete turned government operative Xander Cage comes out of self-imposed exile, thought to be long dead, and is set on a collision course with deadly alpha warrior Xiang and his team in a race to recover a sinister and seemingly unstoppable weapon known as Pandora's Box. Recruiting an all-new group of thrill-seeking cohorts, Xander finds himself enmeshed in a deadly conspiracy that points to collusion at the highest levels of world governments.\",\"release_date\":\"2017-01-13\",\"genre_ids\":[28,12,80,53],\"id\":47971,\"original_title\":\"xXx: Return of Xander Cage\",\"original_language\":\"en\",\"title\":\"xXx: Return of Xander Cage\",\"backdrop_path\":\"\\/6AewnVY9zBgVQEuCufLvsufeRcH.jpg\",\"popularity\":39.499648,\"vote_count\":451,\"video\":false,\"vote_average\":5.5},{\"poster_path\":\"\\/ylXCdC106IKiarftHkcacasaAcb.jpg\",\"adult\":false,\"overview\":\"Mia, an aspiring actress, serves lattes to movie stars in between auditions and Sebastian, a jazz musician, scrapes by playing cocktail party gigs in dingy bars, but as success mounts they are faced with decisions that begin to fray the fragile fabric of their love affair, and the dreams they worked so hard to maintain in each other threaten to rip them apart.\",\"release_date\":\"2016-12-01\",\"genre_ids\":[35,10402,10749,18],\"id\":313369,\"original_title\":\"La La Land\",\"original_language\":\"en\",\"title\":\"La La Land\",\"backdrop_path\":\"\\/fp6X6yhgcxzxCpmM0EVC6V9B8XB.jpg\",\"popularity\":38.974794,\"vote_count\":1397,\"video\":false,\"vote_average\":8},{\"poster_path\":\"\\/5vHssUeVe25bMrof1HyaPyWgaP.jpg\",\"adult\":false,\"overview\":\"After the sudden death of his beloved wife, John Wick receives one last gift from her, a beagle puppy named Daisy, and a note imploring him not to forget how to love. But John's mourning is interrupted when his 1969 Boss Mustang catches the eye of sadistic thug Iosef Tarasov who breaks into his house and steals it, beating John unconscious in the process. Unwittingly, he has just reawakened one of the most brutal assassins the underworld has ever known.\",\"release_date\":\"2014-10-22\",\"genre_ids\":[28,53],\"id\":245891,\"original_title\":\"John Wick\",\"original_language\":\"en\",\"title\":\"John Wick\",\"backdrop_path\":\"\\/mFb0ygcue4ITixDkdr7wm1Tdarx.jpg\",\"popularity\":37.67861,\"vote_count\":3023,\"video\":false,\"vote_average\":7},{\"poster_path\":\"\\/xfWac8MTYDxujaxgPVcRD9yZaul.jpg\",\"adult\":false,\"overview\":\"After his career is destroyed, a brilliant but arrogant surgeon gets a new lease on life when a sorcerer takes him under his wing and trains him to defend the world against evil.\",\"release_date\":\"2016-10-25\",\"genre_ids\":[28,12,14,878],\"id\":284052,\"original_title\":\"Doctor Strange\",\"original_language\":\"en\",\"title\":\"Doctor Strange\",\"backdrop_path\":\"\\/sDNhWjd4X7c0oOlClkkwvqVOo45.jpg\",\"popularity\":37.440622,\"vote_count\":2068,\"video\":false,\"vote_average\":6.8},{\"poster_path\":\"\\/bndiUFfJxNd2fYx8XO610L9a07m.jpg\",\"adult\":false,\"overview\":\"WWII American Army Medic Desmond T. Doss, who served during the Battle of Okinawa, refuses to kill people and becomes the first Conscientious Objector in American history to win the Congressional Medal of Honor.\",\"release_date\":\"2016-11-04\",\"genre_ids\":[18,36,10752],\"id\":324786,\"original_title\":\"Hacksaw Ridge\",\"original_language\":\"en\",\"title\":\"Hacksaw Ridge\",\"backdrop_path\":\"\\/zBK4QZONMQXhcgaJv1YYTdCW7q9.jpg\",\"popularity\":35.903897,\"vote_count\":777,\"video\":false,\"vote_average\":7.3},{\"poster_path\":\"\\/kqjL17yufvn9OVLyXYpvtyrFfak.jpg\",\"adult\":false,\"overview\":\"An apocalyptic story set in the furthest reaches of our planet, in a stark desert landscape where humanity is broken, and most everyone is crazed fighting for the necessities of life. Within this world exist two rebels on the run who just might be able to restore order. There's Max, a man of action and a man of few words, who seeks peace of mind following the loss of his wife and child in the aftermath of the chaos. And Furiosa, a woman of action and a woman who believes her path to survival may be achieved if she can make it across the desert back to her childhood homeland.\",\"release_date\":\"2015-05-13\",\"genre_ids\":[28,12,878,53],\"id\":76341,\"original_title\":\"Mad Max: Fury Road\",\"original_language\":\"en\",\"title\":\"Mad Max: Fury Road\",\"backdrop_path\":\"\\/phszHPFVhPHhMZgo0fWTKBDQsJA.jpg\",\"popularity\":32.958834,\"vote_count\":6628,\"video\":false,\"vote_average\":7.2},{\"poster_path\":\"\\/nHXiMnWUAUba2LZ0dFkNDVdvJ1o.jpg\",\"adult\":false,\"overview\":\"Vampire death dealer Selene fends off brutal attacks from both the Lycan clan and the Vampire faction that betrayed her. With her only allies, David and his father Thomas, she must stop the eternal war between Lycans and Vampires, even if it means she has to make the ultimate sacrifice.\",\"release_date\":\"2016-11-30\",\"genre_ids\":[28,27],\"id\":346672,\"original_title\":\"Underworld: Blood Wars\",\"original_language\":\"en\",\"title\":\"Underworld: Blood Wars\",\"backdrop_path\":\"\\/PIXSMakrO3s2dqA7mCvAAoVR0E.jpg\",\"popularity\":32.08492,\"vote_count\":792,\"video\":false,\"vote_average\":4.5},{\"poster_path\":\"\\/5N20rQURev5CNDcMjHVUZhpoCNC.jpg\",\"adult\":false,\"overview\":\"Following the events of Age of Ultron, the collective governments of the world pass an act designed to regulate all superhuman activity. This polarizes opinion amongst the Avengers, causing two factions to side with Iron Man or Captain America, which causes an epic battle between former allies.\",\"release_date\":\"2016-04-27\",\"genre_ids\":[878,28],\"id\":271110,\"original_title\":\"Captain America: Civil War\",\"original_language\":\"en\",\"title\":\"Captain America: Civil War\",\"backdrop_path\":\"\\/m5O3SZvQ6EgD5XXXLPIP1wLppeW.jpg\",\"popularity\":30.597021,\"vote_count\":4393,\"video\":false,\"vote_average\":6.8},{\"poster_path\":\"\\/gri0DDxsERr6B2sOR1fGLxLpSLx.jpg\",\"adult\":false,\"overview\":\"In 1926, Newt Scamander arrives at the Magical Congress of the United States of America with a magically expanded briefcase, which houses a number of dangerous creatures and their habitats. When the creatures escape from the briefcase, it sends the American wizarding authorities after Newt, and threatens to strain even further the state of magical and non-magical relations.\",\"release_date\":\"2016-11-16\",\"genre_ids\":[28,12,14],\"id\":259316,\"original_title\":\"Fantastic Beasts and Where to Find Them\",\"original_language\":\"en\",\"title\":\"Fantastic Beasts and Where to Find Them\",\"backdrop_path\":\"\\/6I2tPx6KIiBB4TWFiWwNUzrbxUn.jpg\",\"popularity\":30.398498,\"vote_count\":2140,\"video\":false,\"vote_average\":7},{\"poster_path\":\"\\/zkXnKIwX5pYorKJp2fjFSfNyKT0.jpg\",\"adult\":false,\"overview\":\"John Wick is forced out of retirement by a former associate looking to seize control of a shadowy international assassins’ guild. Bound by a blood oath to aid him, Wick travels to Rome and does battle against some of the world’s most dangerous killers.\",\"release_date\":\"2017-02-09\",\"genre_ids\":[53,28,80],\"id\":324552,\"original_title\":\"John Wick: Chapter 2\",\"original_language\":\"en\",\"title\":\"John Wick: Chapter 2\",\"backdrop_path\":\"\\/uhgINoAy9mM3gG1kBExgZfFlR47.jpg\",\"popularity\":28.765327,\"vote_count\":180,\"video\":false,\"vote_average\":6.5}],\"total_results\":19539,\"total_pages\":977}";

        try {
            JSONObject movieJson = new JSONObject(json);
            JSONArray movieArray = movieJson.getJSONArray("results");

            for (int i = 0; i < movieArray.length(); i++) {
                String poster;
                String title;
                String popularity;
                String overview;
                JSONObject currentItem = movieArray.getJSONObject(i);
                poster = currentItem.getString("poster_path");
                String image = "http://image.tmdb.org/t/p/w780/";
                String URL = image + poster;
                title = currentItem.getString("title");
                popularity = currentItem.getString("popularity");
                overview = currentItem.getString("overview");

                Movie movie = new Movie(URL, overview, title, popularity);
                movies.add(movie);
            }

        } catch (JSONException e){}

        adapter.notifyDataSetChanged();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.more_button, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    public boolean sortMovie(Movie title){

    }
}
