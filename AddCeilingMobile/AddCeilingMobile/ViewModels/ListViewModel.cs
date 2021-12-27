using AddCeilingMobile.Models;
using System;
using System.Collections.Generic;
using System.Text;
using Xamarin.Forms.Shapes;

namespace AddCeilingMobile.ViewModels
{
    internal class ListViewModel
    {
        public List<Ceiling> Ceilings { get; set; }
        public PointCollection Points { get; set; }

        public ListViewModel()
        {

        }
    }
}
