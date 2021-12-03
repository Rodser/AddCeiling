using System.Collections.Generic;
using Xamarin.Forms;
using Xamarin.Forms.Shapes;

namespace AddCeilingMobile
{
    internal class Repository
    {
        public List<Angle> DefaultAngles { get; set; }
        public PointCollection Points { get; set; }

        public Repository()
        {
            DefaultAngles = new List<Angle>
            {
                new Angle(45), 
                new Angle(90), 
                new Angle(135),
                new Angle(225),
                new Angle(270),
                new Angle(315),
            };
            Points = new PointCollection
            {
                new Point { X = 0, Y = 0},
                new Point { X = 240, Y = 0},
                new Point { X = 240, Y = 160},
                new Point { X = 0, Y = 160}
            };
        }
    }
}
