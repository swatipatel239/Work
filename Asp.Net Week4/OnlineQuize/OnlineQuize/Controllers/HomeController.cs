using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace OnlineQuize.Controllers
{
    public class HomeController : Controller
    {
        List<QuestionsDatabase> dq = new List<QuestionsDatabase>();
        // GET: Home
        public ActionResult Index()
        {
            return View();
        }
        public ActionResult Login()
        {
            return View();
        }
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Login(Login user)
        {
            //this action is for handle post login
            if (ModelState.IsValid) // this is to check validaty
            {
                using (LinqClassDataContext dbCotext = new LinqClassDataContext())
                {
                    var QryReslt = dbCotext.Logins.Where(a => a.UserName.Equals(user.UserName) && a.Password.Equals(user.Password)).FirstOrDefault();
                    if (QryReslt != null)
                    {
                        Session["Usename"] = user.UserName;
                        return RedirectToAction("AfterLogin");
                    }
                    else
                    {
                        ViewBag.Message = "Username and Password Does not match! Please check one more time";
                    }

                }

            }
            return View(user);
        }
        public ActionResult AfterLogin()
        {

            if (Session["Usename"] != null)
            {
                return View();
            }
            else
            {
                return RedirectToAction("Index");
            }
        }
        [HttpPost]
        public ActionResult QuizeStart()
        {
            //this action is for handle post login
            if (ModelState.IsValid) // this is to check validaty
            {
                using (LinqClassDataContext dbCotext = new LinqClassDataContext())
                {
                    var q =
                        from a in dbCotext.QuestionsDatabases
                        select a;
                    dq = q.ToList();
                    ViewBag.ass = dq;
                }
            }
            return View();
        }
    }
}