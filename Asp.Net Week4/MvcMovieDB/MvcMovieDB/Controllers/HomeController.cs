using MvcMovieDB.Models;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Net;
using System.Web;
using System.Web.Mvc;

namespace MvcMovieDB.Controllers
{
    public class HomeController : Controller
    {
         private MvcMoviesDatabaseEntities1 dbConnect = new MvcMoviesDatabaseEntities1();
        // DataClasses1DataContext dbConnect = new DataClasses1DataContext();
        // GET: Home
       
        public ActionResult Index(string searchStr,string movieGenre)
        {
            var q = from m in dbConnect.Movies
                    select m;

            var GenreList = new List<string>();
            var GenreQuery = from d in dbConnect.Movies orderby d.Genre select d.Genre;

            GenreList.AddRange(GenreQuery.Distinct());
            ViewBag.movieGenre = new SelectList(GenreList);

            if (!String.IsNullOrEmpty(movieGenre))
            {
                q = q.Where(x => x.Genre == movieGenre);
            }

            if (!String.IsNullOrEmpty(searchStr))
            {
                q = q.Where(s => s.Title.Contains(searchStr));
            }
            return View(q);

        }
        //public ActionResult Index()
        //{
        //    var q = from m in dbConnect.Movies
        //            select m;
        //    return View(q);
        //}

        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            //   Movie movie = new Movie();
            Movie movie = dbConnect.Movies.Find(id);
                if (movie == null)
                {
                    return HttpNotFound();
                }
                return View(movie);
        }

        public ActionResult Create()
         {
            return View();
         }
        [HttpPost]
        public ActionResult Create([Bind(Include = "Id,Title,ReleaseDate,Genre,Price")] Movie movie)
        {
             dbConnect.Movies.Add(movie);
             dbConnect.SaveChanges();
             return RedirectToAction("Index");
        }


    public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            //   Movie movie = new Movie();
            Movie movie = dbConnect.Movies.Find(id);
            if (movie == null)
            {
                return HttpNotFound();
            }
            return View(movie);
        }
        [HttpPost]
        public ActionResult Edit([Bind(Include="Id,Title,ReleaseDate,Genre,Price")] Movie movie)
        {
            dbConnect.Entry(movie).State = EntityState.Modified;
            dbConnect.SaveChanges();
            return RedirectToAction("Index");
        }
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            //   Movie movie = new Movie();
            Movie movie = dbConnect.Movies.Find(id);
            if (movie == null)
            {
                return HttpNotFound();
            }
            return View(movie);
        }
        [HttpPost,ActionName("Delete")]
        public ActionResult DeleteConfirmed(int? id)
        {
            Movie movie=  dbConnect.Movies.Find(id);
            dbConnect.Movies.Remove(movie);
            dbConnect.SaveChanges();
            return RedirectToAction("Index");
        }

    }
}