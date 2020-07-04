<?php
use App\Post;
use Illuminate\Support\Facades\Route;

Route::get('home',"HomeController@showWelcome");
Route::get('about',"AboutController@showdetails");
Route::get('about/{theSubject}',"AboutController@showSubject");
Route::get('profile/{name}','ProfileController@showProfile');


Route::get('/', function () {
    return view('welcome');
});

Route::get('about/directions',array('as' => 'directions', function(){
    $theURL = URL::route('directions');
    return "Direction go to this URL: $theURL";
}));

//Route::get('about/{theSubject}',function($theSubject){
//    return $theSubject. ' content goes here';
//});

Route::get('about/classes/{theArt}/{thePrice}',function($theArt,$thePrice){
    return $theArt + $thePrice;
});

Route::get('where',function(){
    return Redirect::route('directions');
});

Route::get('/insert',function(){
    DB::insert('insert into posts(is_admin) value(?)',['22222',0]);
    return 'DONE';
});

Route::get('/read',function(){
    $result = DB::select('select * from posts where id = ?',[1]);
    //return $result;
    foreach ($result as $post){
        return $post->is_admin;
    }
});

Route::get('update',function(){
    $updated = DB::update('update posts set is_admin = "22222222" where id = ?',[1]);
    return $updated;
});

Route::get('delete',function(){
    $deleted = DB::delete('delete from posts where id = ?',[1]);
    return $deleted;
});

Route::get('readAll',function(){
   $posts = Post::all();
   foreach ($posts as $p);
       echo $p->is_admin;
       echo "<br/>";
});

Route::get('findId',function(){
    $posts = Post::where('id','>=',2)
        ->where('is_admin','111111111')
      ->orderBy('id','desc')
      ->take(10)
        ->get();
    foreach ($posts as $p);
    echo $p->is_admin;
    echo "<br/>";
});

Route::get('insertORM',function(){
    $p = new Post;
    $p->is_admin = 3;
    $p->save();
});

Route::get('updateORM',function(){
   $p = Post::where('id',2 )->first();
   $p->is_admin = '3';
   $p->save();
});
Route::get('deleteORM',function(){
   Post::where('id','>=',3)
   ->delete();
});
Route::get('destroyORM',function(){
    Post::destroy([7,8,9]);
});
