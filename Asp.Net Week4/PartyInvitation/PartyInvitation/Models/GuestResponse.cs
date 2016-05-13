using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace PartyInvitation.Models
{
    public class GuestResponse
    {
        [Required(ErrorMessage = "Please enter your name")]
        public string Name { get; set; }

        [Required(ErrorMessage = "Please enter your email address")]
        [RegularExpression(".+\\@.+\\..+", ErrorMessage ="Invalid Email id")]
        public string email { get; set; }

        [Required(ErrorMessage = "Please enter yur phone number")]
        public string  Phone { get; set; }

        [Required(ErrorMessage = "Please tell us are you coming or not")]
        public bool? WillAttend{ get; set; }

    }
}