import Footer from '../components/Footer'
import Navbar from '../components/Navbar'
import { Link } from 'react-router-dom';
import '../screens/css/services.css'
import img from '../images/events.png'
import img2 from '../images/newsletter.png'
import FAQ from '../components/Faq';

const services = [
    { id: 1, title: 'events', description: 'Detailed description about housekeeping.', imageUrl: img, applyLink: '#' },
    { id: 2, title: 'Newsletter', description: 'Detailed description about electrician.', imageUrl: img2, applyLink: '#' },
   // { id: 3, title: 'Plumbing', description: 'Detailed description about plumbing.', imageUrl: img3, applyLink: '#' },
  ];

export default function Landingpage() {
    return(
        <div>
            <Navbar/>
            <div className="services-container">
        <div className="services-card-container">
          {services.map(service => (
          
          <Link to={service.applyLink} key={service.id} className="card-link">
                            <div className="card">
                                <img src={service.imageUrl} className="card-img-top" alt={service.title} />
                                <div className="card-body">
                                    <h5 className="card-title">{service.title}</h5>
                                </div>
                            </div>
                        </Link>
           
            
          ))}
        </div>
      </div>
            <FAQ/>
            <Footer/>
        </div>
    )
}